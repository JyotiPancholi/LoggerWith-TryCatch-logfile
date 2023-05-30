package com.logger.exception.logfile.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class LoggerController {

		@GetMapping("/ExceptionAndLogFile")
		public ResponseEntity<String> getresponse() 
		{
		       try 
		        {
		    	   log.info("Hiii");
			        int a=10;
			        int b=0;
			        int c=a/b;
//			        logger.info("Division ::", c);
			        log.warn("Warn", "WARN");
			        log.info("Division ::", c);
			        return new ResponseEntity<>(c+"",HttpStatus.CONFLICT);
		        } 
		        catch (Exception e)
		        {
		            // Log the exception
//		            logger.error("An exception occurred: {}", e.getMessage());
		        	log.info("biii");
		        	log.error("An exception occurred: {}", e.getMessage());
		        	return new ResponseEntity<>("Exception occured...",HttpStatus.CONFLICT);
		           
		        }
		       

		}
}
