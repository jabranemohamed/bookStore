package com.mhj.bookstore.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author GRDF
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private String title;

}
