package br.com.E3N.cleanArchitecture;

import br.com.E3N.cleanArchitecture.core.application.dto.cart.CartDto;
import br.com.E3N.cleanArchitecture.core.application.dto.order.OrderDto;
import br.com.E3N.cleanArchitecture.core.application.dto.product.CreateProductDto;
import br.com.E3N.cleanArchitecture.core.application.dto.product.ProductDto;
import br.com.E3N.cleanArchitecture.infrastructure.controllers.OrderController;
import br.com.E3N.cleanArchitecture.infrastructure.controllers.ProductController;

import java.math.BigDecimal;
import java.util.List;

public class FakingRequest {

    private static final ProductController productController = new ProductController();
    private static final OrderController ORDER_CONTROLLER = new OrderController();

    public static void createProduct(){
        var product1 = new CreateProductDto("p1", BigDecimal.TEN);
        var product2 = new CreateProductDto("p2", BigDecimal.TWO);
        var product3 = new CreateProductDto("p3", BigDecimal.valueOf(15));
        productController.create(product1);
        productController.create(product2);
        productController.create(product3);
    }

    public static List<ProductDto> findAll(){
        return productController.findAll();
    }

    public static void createOrder(CartDto dto){
        ORDER_CONTROLLER.create(dto);
    }

    public static List<OrderDto> findAllOrder(){
        return ORDER_CONTROLLER.findAll();
    }
}
