package com.ecom.service.discovery;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ecom.dto.ProductDTO;

@FeignClient(name = "product-service")
public interface ProductFeignClient {

	@PostMapping("/product/saveProduct")
    ProductDTO save( @RequestBody ProductDTO productDTO);
    
    @GetMapping("/getProduct")
    List<ProductDTO> getAllProducts();

}

