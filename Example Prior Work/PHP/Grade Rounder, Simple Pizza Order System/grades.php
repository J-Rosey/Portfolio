<?php
    $input = htmlspecialchars($_POST['input']);
    $gradeNum = "";
    $gradeAlph = "";
    
    // Check for input. If none, exit program
    if (empty($input)) {
        echo "<h2>Error: No Input Detected.</h2>";
        exit;
    }

    // Extracts all numbers from $input and places it into float var
    $inNum = (float)preg_replace("/[^0-9\.]/", '', $input);
    // Extracts all chars from $input, converts to uppercase, and places it into string var
    $inChar = strtoupper(preg_replace('/[^a-zA-Z]/', '', $input));

    // Only triggers if a numeric value is found
    if (!empty($inNum)) {
        // Nested if statement to determine grade
        if ($inNum >= 85) {
            $gradeNum = "A";
        } else{
            if ($inNum >= 75) {
                $gradeNum = "B";
            } else {
                if ($inNum >= 60) {
                    $gradeNum = "C";
                } else {
                    $gradeNum = "F";
                }
            }
        }
        // Echo grade
        echo "<h2>Value Detected: $inNum </h2>";
        echo "<h2>Grade Recieved: $gradeNum</h2>";
        // Quit program and prevent other code from running
        exit;
    }

    // Only triggers if a string value is detected
    if (!empty($inChar)) {
        // Switch case to determine grade range
        switch ($inChar) {
            case "A":
                echo "<h2>Value Detected: $inChar </h2>";
                echo "<h2>Grade Range: 100 - 85</h2>";
                break;
            case "B":
                echo "<h2>Value Detected: $inChar </h2>";
                echo "<h2>Grade Range: 84.99 - 75</h2>";
                break;
            case "C":
                echo "<h2>Value Detected: $inChar </h2>";
                echo "<h2>Grade Range: 74.99 - 60</h2>";
                break;
            case "F":
                echo "<h2>Value Detected: $inChar </h2>";
                echo "<h2>Grade Range: 59.99 - 0</h2>";
                break;
            default:
                echo "<h2>Error: Invalid Input Detected.</h2>";
                echo "<h2>Value Detected: $inChar </h2>";
        } 
        // Quit program and prevent other code from running
        exit;
    }
?>