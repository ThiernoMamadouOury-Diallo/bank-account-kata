package com.socgen.itec.bank.account.kata.config;

import com.socgen.itec.bank.account.kata.unit.controller.AccountManagement;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static com.socgen.itec.bank.account.kata.constants.PathConstants.REST_API_PATH;

@Configuration
@ApplicationPath(REST_API_PATH)
public class RestApiJerseyConfig extends ResourceConfig {
    public RestApiJerseyConfig(){
        registerClasses(this.getComponents());
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);

    }
    protected Set<Class<?>> getComponents(){
        return new HashSet<>(Arrays.asList(
                //API ENDPOINTS
                AccountManagement.class

        ));
    }
}
