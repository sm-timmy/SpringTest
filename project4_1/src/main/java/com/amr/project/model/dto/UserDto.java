package com.amr.project.model.dto;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class UserDto {
    private Long id;
    private String username;
    private int age;
    private String gender;
    private String email;
    private String phone;
    private AddressDto address;
    private ImageDto images;
    private Calendar birthday;
    private List<OrderDto> orders = new ArrayList<>();
    private List<ShopDto> shops = new ArrayList<>();





}
