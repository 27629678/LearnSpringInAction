package com.xoyo.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {SgtPeppers.class})
//@ComponentScan(basePackages = {"com.xoyo.soundsystem", "com.xoyo.knights"})
public class CDPlayerConfig {

}
