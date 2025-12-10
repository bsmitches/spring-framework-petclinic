package org.springframework.samples.petclinic.web;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.samples.petclinic.service.ClinicService;

/**
 * Test configuration for web controller tests.
 * Uses Java configuration to properly define mock beans that Spring 6 can autowire.
 */
@Configuration
@ImportResource({"classpath:spring/mvc-core-config.xml"})
public class WebTestConfig {

    @Bean
    public ClinicService clinicService() {
        return Mockito.mock(ClinicService.class);
    }
}
