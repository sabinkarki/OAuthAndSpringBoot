package com.resource.server.domain;


import com.resource.server.domain.enums.Gender;
import com.resource.server.domain.enums.Status;
import lombok.*;

/**
 * Created by sabin on 8/7/2017.
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Patient {

    private Long patientId;
    private String firstName;
    private String lastName;
    private Gender gender;
    private Status status;
    private String medicalOrder;
    private String dosage;
}
