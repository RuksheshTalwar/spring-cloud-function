package dev.rukshesh.functions.cloud_functions_example.web.functions;

import dev.rukshesh.functions.cloud_functions_example.payload.RequestData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Configuration
public class WebFunctions {

    //This will get exposed as an endpoint
    @Bean
    public Supplier<String> sayHello() {
        return () -> "Hello how are you ?";
    }


    @Bean
    public Consumer<RequestData> inputData() {
        return (inputData) -> {
            System.out.println(inputData.getName());
            System.out.println(inputData.getContact());
        };
    }

    @Bean
    public Function<RequestData, String> submitData() {
        return (inputData) ->  "Data submitted " + inputData.getName();
    }
}
