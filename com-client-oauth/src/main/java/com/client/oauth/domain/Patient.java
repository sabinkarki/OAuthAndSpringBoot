package com.client.oauth.domain;

import com.client.oauth.domain.enums.Gender;
import com.client.oauth.domain.enums.Status;
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
