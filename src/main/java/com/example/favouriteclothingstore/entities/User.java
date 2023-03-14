package com.example.favouriteclothingstore.entities;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
@Table(name = "user-tbl")
public class User extends Person {

}
