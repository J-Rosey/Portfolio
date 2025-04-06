<?php
    // Vars
    $pizza = htmlspecialchars($_POST['pizza']);
    $pizzaSize = "";
    $total = 0;
    $topping = array();

    // Switch case to record pizza size and price
    switch ($pizza) {
        case "small":
            $total = 9.00;
            $pizzaSize = "Small";
            break;
        case "medium":
            $total = 12.50;
            $pizzaSize = "Medium";
            break;
        case "large":
            $total = 15.00;
            $pizzaSize = "Large";
            break;
        case "xlarge":
            $total = 17.50;
            $pizzaSize = "Extra Large";
            break;
        case "none":
            echo "<h2>Error: No Pizza Selected.</h2>";
            exit;
        default:
            // In case something bad happens. Shuts down program
            echo "<h2>Critical Error Detected.</h2>";
            exit;
    }

    // Checks if topping is selected. If so, increments price and adds it to array
    if (isset($_POST["cheese"])) {
        $topping[] = "Cheese";
    }

    if (isset($_POST["pepperoni"])) {
        $total++;
        $topping[] = "Pepperoni";
    }

    if (isset($_POST["olives"])) {
        $total++;
        $topping[] = "Olives";
    }

    if (isset($_POST["pineapple"])) {
        $total++;
        $topping[] = "Pineapple";
    }

    if (isset($_POST["ham"])) {
        $total++;
        $topping[] = "Ham";
    }

    // Displays selected pizza size
    echo "<h2>Pizza Size Selected: $pizzaSize</h2>";
    // Implodes array to add commas, prints array containing all selected toppings
    $toppings = implode(", ", $topping);
    echo "<h2>Toppings Selected: ";
    print_r($toppings);
    echo ".</h2>";
    // Prints total cost
    echo "<h2>Total Cost: $$total</h2>";

    // Rightfully insults the user for their poor taste
    if (!(isset($_POST["cheese"])) && 
        !(isset($_POST["pepperoni"])) && 
        !(isset($_POST["olives"])) && 
        !(isset($_POST["ham"])) && 
        (isset($_POST["pineapple"]))) 
        {
        echo "<h2>Heretic.</h2>";
    }
?>