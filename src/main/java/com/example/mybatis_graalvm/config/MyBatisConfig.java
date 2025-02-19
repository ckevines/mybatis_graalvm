//package com.example.mybatis_graalvm.config;
//
//import org.mybatis.spring.mapper.MapperScannerConfigurer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Lazy;
//
//@Configuration(proxyBeanMethods = false)  // Add this to prevent CGLIB proxying
//public class MyBatisConfig {
//    @Bean
//    @Lazy  // Add lazy initialization
//    public MapperScannerConfigurer mapperScannerConfigurer() {
//        MapperScannerConfigurer scannerConfigurer = new MapperScannerConfigurer();
//        scannerConfigurer.setBasePackage("com.example.mybatis_graalvm.mapper");
//        return scannerConfigurer;
//    }
//}