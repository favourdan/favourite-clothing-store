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
@Table(name = "admin-tbl")
public class Admin extends Person {


}
