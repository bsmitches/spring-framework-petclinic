package org.springframework.samples.petclinic.web;

import org.mockito.Mockito;
import org.springframework.samples.petclinic.service.ClinicService;

/**
 * Factory class to create a properly typed mock ClinicService for Spring 6 compatibility.
 * Spring 6 has stricter type checking for beans created via factory methods.
 */
public class MockClinicServiceFactory {

    public static ClinicService createMock() {
        return Mockito.mock(ClinicService.class);
    }
}
