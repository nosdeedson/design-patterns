package br.com.E3N.shared;

import java.io.IOException;

public interface RemoteServiceInterface {
    long doRemoteFunction(final int value, final int timeout);
    String getTheTitle(final int id, final int timeout);
    String getTheTitle(final int id, final int timeout, final boolean hasToThrow);
}
