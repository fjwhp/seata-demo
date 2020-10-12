package com.ting.seata.server;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/*@SpringBootApplication( exclude = DataSourceAutoConfiguration.class)
public class ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
        System.out.println("ddddddddddddddddddd");
    }

}*/
@SpringBootApplication( exclude = DataSourceAutoConfiguration.class)
public class ServerApplication implements CommandLineRunner {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ServerApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        Thread.currentThread().join();
    }
}