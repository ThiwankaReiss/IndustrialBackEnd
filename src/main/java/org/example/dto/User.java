package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String name;
    private String nameWithInitials;
    private String birthDate;
    private String contactNumber;
    private String civilStatus;
    private String incomeSource;
    private String profession;
    private String contactNumberType;
    private String gender;
    private String birthCountry;
}
