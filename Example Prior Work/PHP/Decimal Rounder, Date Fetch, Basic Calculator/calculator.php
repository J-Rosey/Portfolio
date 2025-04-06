<?php
    $x = htmlspecialchars(floatval($_POST['calc1']));
    $y = htmlspecialchars(floatval($_POST['calc2']));

    echo "<h3>";
    echo "$x plus $y is " . addThem($x, $y) . ".<br>"; 
    echo "$x minus $y is " . subtractThem($x, $y) . ".<br>";
    echo "$x muliply $y is " . multiplyThem($x, $y) . ".<br>";
    echo "$x divide $y is " . divideThem($x, $y) . ".<br>";
    echo "</h3>";

    function addThem($x, $y) {return $x + $y;}

    function subtractThem($x, $y) {return $x - $y;}

    function multiplyThem($x, $y) {return $x * $y;}

    function divideThem($x, $y) {return $x / $y;}
?>