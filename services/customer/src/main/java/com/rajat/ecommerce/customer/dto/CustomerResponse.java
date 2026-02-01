package com.rajat.ecommerce.customer.dto;

import com.rajat.ecommerce.customer.entity.Address;

public record CustomerResponse(
        String id,
        String firstname,
        String lastname,
        String email,
        Address address
) {

}
