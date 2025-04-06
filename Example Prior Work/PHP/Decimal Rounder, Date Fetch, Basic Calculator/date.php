<?php
    $input = htmlspecialchars(($_POST['day']));

    $baseDate = date_create("2016-06-30");
    $inputDate = date_create($input);
    
    $dateDiff = date_diff($baseDate, $inputDate);

    echo "<h3>It has been ";
    echo $dateDiff->format("%a");
    echo " days since June 30th, 2016.</h3>";
?>