package com.hewayah.hello_world.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import javax.persistence.*;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "bill")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BillEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bill_id")
    private Integer billId;

    @Column(name = "hobbyist_username_bill")
    private String hobbyistUsernameBill;

    @Column(name = "service_provider_user_name_bill")
    private String serviceProviderUserNameBill;

    @Column(name = "time")
    private Date time;

    @Column(name = "event_id")
    private Integer eventId;

    @Column(name = "is_pay")
    private boolean isPay;


}