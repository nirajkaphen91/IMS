package com.cts.assignment.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.cts.assignment.model.StockLog;


//@RestController
//@RequestMapping("/stocks")
public class StockController {
	
	 @Autowired
	    private com.cts.assignment.service.StockService stockService;
	    @Autowired
	    private StockLog stockLogService;
	    
	  

}
