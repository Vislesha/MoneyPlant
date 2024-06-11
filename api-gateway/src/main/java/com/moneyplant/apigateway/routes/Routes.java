package com.moneyplant.apigateway.routes;

import org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions;
import org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.cloud.gateway.server.mvc.filter.FilterFunctions.setPath;

@Configuration
public class Routes {

    @Bean
    public RouterFunction<ServerResponse> stockServiceRoute() {
        return GatewayRouterFunctions.route("stock_service")
                .route(RequestPredicates.path("/api/stock"),
                        HandlerFunctions.http("http://localhost:9740"))
                .build();
    }

    @Bean
    public RouterFunction<ServerResponse> stockServiceSwaggerRoute() {
        return GatewayRouterFunctions.route("stock_service_swagger")
                .route(RequestPredicates.path("/aggregate/stock-service/v1/api-docs"),
                        HandlerFunctions.http("http://localhost:9740"))
                .filter(setPath("/api-docs"))
                .build();
    }


    @Bean
    public RouterFunction<ServerResponse> portfolioServiceRoute() {
        return GatewayRouterFunctions.route("portfolio_service")
                .route(RequestPredicates.path("/api/portfolio"),
                        HandlerFunctions.http("http://localhost:9750"))
                .build();
    }

    @Bean
    public RouterFunction<ServerResponse> portfolioServiceSwaggerRoute() {
        return GatewayRouterFunctions.route("portfolio_service_swagger")
                .route(RequestPredicates.path("/aggregate/portfolio-service/v1/api-docs"),
                        HandlerFunctions.http("http://localhost:9750"))
                .filter(setPath("/api-docs"))
                .build();
    }


    @Bean
    public RouterFunction<ServerResponse> transactionServiceRoute() {
        return GatewayRouterFunctions.route("transaction_service")
                .route(RequestPredicates.path("/api/transaction"),
                        HandlerFunctions.http("http://localhost:9760"))
                .build();
    }

    @Bean
    public RouterFunction<ServerResponse> transactionServiceSwaggerRoute() {
        return GatewayRouterFunctions.route("transaction_service_swagger")
                .route(RequestPredicates.path("/aggregate/transaction-service/v1/api-docs"),
                        HandlerFunctions.http("http://localhost:9760"))
                .filter(setPath("/api-docs"))
                .build();
    }


    @Bean
    public RouterFunction<ServerResponse> watchlistServiceRoute() {
        return GatewayRouterFunctions.route("watchlist_service")
                .route(RequestPredicates.path("/api/watchlist"),
                        HandlerFunctions.http("http://localhost:9770"))
                .build();
    }

    @Bean
    public RouterFunction<ServerResponse> watchlistServiceSwaggerRoute() {
        return GatewayRouterFunctions.route("watchlist_service_swagger")
                .route(RequestPredicates.path("/aggregate/watchlist-service/v1/api-docs"),
                        HandlerFunctions.http("http://localhost:9770"))
                .filter(setPath("/api-docs"))
                .build();
    }
}
