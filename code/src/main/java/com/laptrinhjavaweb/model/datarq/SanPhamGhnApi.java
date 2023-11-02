package com.laptrinhjavaweb.model.datarq;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class SanPhamGhnApi {

    private String name;
 //   private String code;
    private int quantity;
    private long price;
//    private int length;
//    private int width;
//    private int weight;
//    private int height;
//    private Category category;
}
