package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "postal_mails")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostalMail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;

    private Long recipientPostcode;

    private String recipientAddress;

    private String recipientName;
}
