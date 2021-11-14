package com.example.duyshop.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "transaction")
@Component
public class TransactionEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer status;
    private Integer voucherId;
    private Date created;
    @JsonIgnore
    @ManyToOne
    @JoinColumn
    private StaffEntity staff;
    @JsonIgnore
    @ManyToOne
    @JoinColumn
    private CustomerEntity customer;
    @JsonIgnore
    @OneToMany(mappedBy = "transaction")
    private List<OrderDetailEntity> orderDetails;
}
