# Software Testing Midterm Part Two: Smart-Home Energy Rebate

## Overview
This repository contains the implementation and automated testing suite for Part Two of the Software Testing Midterm.

## Exam Deliverables & Documentation
The test design documentation, test coverage items (TCIs), and the Test Breaker fault analysis have been compiled into external documents for clean formatting. (PDF versions are also included in this repo as backup).

* **[Test Design & TCIs (LINK)](https://docs.google.com/spreadsheets/d/15Qm7wLU7ggW9hX01KJDmZsnk9v305mCQOB1XBs-CnAE/edit?usp=sharing)**
  * *Contains Equivalence Partitions, Boundary Value Analysis, and the Decision Table, along with my outlined TCIs, and an easy to view tab with my csv formatted tests. I tried my best to follow the example we covered in class from Lab 3.*
* **[Test Breaker & Fault Analysis (LINK)](https://docs.google.com/document/d/1cQq9cO8ChBGwXKVn7_09hDJju3EiYYD0oAhJF4034qM/edit?usp=sharing)**
  * *Contains the 5 specified faults demonstrating how different testing methods catch specific bugs. I was unsure if you wanted a full "broken" class, and instead focused on explicit code examples with accompanied explanation in a separate document.*

## Implementation
* **Source Code:** `src/main/java/EnergyCalculator.java`
* **Test Suite:** `src/test/java/EnergyCalculatorTest.java`
* **Test Data:** Parameterized tests are driven by the CSV file located in `src/test/resources/midterm_tests.CSV`.

## Automation & Code Coverage
The test suite is fully automated using Maven. It successfully catches all invalid inputs and achieves **100% Instruction (Statement) Coverage** and **100% Branch Coverage**. 

Below is the generated JaCoCo Code Coverage report:

![JaCoCo Code Coverage Report](<JaCoCo Report.png>)
