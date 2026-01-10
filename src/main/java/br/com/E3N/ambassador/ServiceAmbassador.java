package br.com.E3N.ambassador;

import br.com.E3N.shared.RemoteService;
import br.com.E3N.shared.RemoteServiceInterface;

import static java.lang.Thread.sleep;

public class ServiceAmbassador {
    private static final int RETRIES = 3;
    private static final int DELAY_MS = 3_000;
    private static final int FAILURE = -1;

    public ServiceAmbassador() {
    }

    public long doRemoteFunction(final int value) throws Exception {
        return safeCall(value);
    }

    private long checkLatency(final int value) throws Exception {
        try {
            var startTime = System.currentTimeMillis();
            RemoteServiceInterface remoteService = RemoteService.getInstance();
            final int idToRequestFromAPI = 1;
            final int timeoutTime = 1000;
            var result = remoteService.doRemoteFunction(idToRequestFromAPI, timeoutTime);
            var timeTaken = System.currentTimeMillis() - startTime;

            System.out.printf("Time taken (ms): %d ", timeTaken);
            return result;
        } catch (Exception e) {
            System.out.printf("Remote call failed: %s%n", e.getMessage());
            return FAILURE;
        }
    }

    private long safeCall(final int value) throws Exception {
        long result = FAILURE;
        for (int i = 0; i < RETRIES; i++) {
            if ((result = checkLatency(value)) == FAILURE) {
                System.out.printf("Failed to reach remote: (%d)%n", (i + 1));
//                try {
//                    sleep(DELAY_MS);
//                } catch (InterruptedException e) {
//                    System.out.printf("Thread sleep state interrupted [%s]%n", e.getMessage());
//                }
            } else {
                break;
            }
        }
        return result;
    }
}
