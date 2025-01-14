/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.dto.request;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author pc
 */
@Getter
@Setter
public class ActivityRequest {
    private Long planningRecId;
    private String bookingStartTime;
    private String bookingEndTime;
}
