package com.amr.project.model.entity;


import com.amr.project.model.enums.Gender;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Calendar;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class User implements UserDetails {

    private Long id;
    private String email;
    private String username = "default_uname";
    private String password;
    private boolean activate;
    private String activationCode;
    private String phone;
    private String firstName = "Bill";
    private String lastName = "Jones";
    private int age;
    private Address address;
    private Set<Role> roles;
    private Gender gender;
    private Calendar birthday;
    private Image images;
    private List<Coupon> coupons;
    private List<CartItem> cart;
    private List<Order> orders;
    private List<Review> reviews;
    private List<Shop> shops;
    private Favorite favorite;
    private List<Discount> discounts;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return username;
    }

//    @Override
//    public String getUsername() {
//        return null;
//    }


    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActivate() {
        return activate;
    }

    public String getActivationCode() {
        return activationCode;
    }

    public String getPhone() {
        return phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public Gender getGender() {
        return gender;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return activate;
    }
}
