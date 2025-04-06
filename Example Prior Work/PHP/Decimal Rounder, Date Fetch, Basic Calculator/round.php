<?php
    $num = htmlspecialchars(floatval($_POST['num']));

    if(fmod($num, 1) != 0.00) {
        echo "<h3>Your input: " . $num . "</h3>";
        // ceil
        echo "<h3>Rounded through 'ceil': " . (ceil($num) . "</h3>");
        // floor
        echo "<h3>Rounded through 'floor': " . (floor($num) . "</h3>");
        // round
        echo "<h3>Rounded through 'round': " . (round($num) . "</h3>");
    } else {
        echo "<h2>Invalid input. Please enter only decimal numbers.</h2>";
    }
?>