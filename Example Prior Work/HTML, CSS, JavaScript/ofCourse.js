"use strict";

// All necessary course information
let courses = [
    {
        "id": 0,
        "course": "OSYS 1000",
        "title": "Operating Systems - Linux",
        "instructor": "Instructor 1",
        "description": "This course introduces the skills and knowledge that will enable the student to install, configure, maintain and troubleshoot a current UNIX based operating system (OS) in standalone workstation mode.",
        "room": 114,
        "colour": "#ff6868b6",
        "timeslots": ["mon1", "mon2", "wed1", "wed2"]
    },
    {
        "id": 1,
        "course": "SAAD 1001",
        "title": "Intro to Sys Analysis & Design",
        "instructor": "Instructor 1",
        "description": "This course explores the analysis and design phases of the software development life cycle using object-oriented methodologies and tools. Exploration can include an introduction to the Unified Modelling Language (UML), the philosophy of agile development/design and the basics of good proposal writing.",
        "room": 114,
        "colour": "#9c4d4d9d",
        "timeslots": ["mon5", "mon6", "wed5", "wed6"]
    },
    {
        "id": 2,
        "course": "PROG 2007",
        "title": "Programming in C",
        "instructor": "Instructor 2",
        "description": "This course introduces students to the C programming language, focusing on the various uses of pointers, efficient memory management and interfacing with the standard C libraries. The course will also highlight the differences between the C language and other common programming languages that learners may be familiar with, in terms of syntax and coding practices.",
        "room": 114,
        "colour": "#e2e271",
        "timeslots": ["tue1", "tue2", "fri1", "fri2"]
    },
    {
        "id": 3,
        "course": "PROG 2700",
        "title": "Client Side Programming",
        "instructor": "Instructor 2",
        "description": "This course builds on the concepts covered in Introduction to HTML by adding functionality to static web pages through client side programming and CSS pre-processors / libraries. A heavy focus is placed on developing without the use of large JS frameworks/libraries. Foundational data sending and retrieval will also be explored using JSON data formats.",
        "room": 114,
        "colour": "#72b164b6",
        "timeslots": ["mon3", "mon4", "tue5", "tue6", "thr1", "thr2"]
    },
    {
        "id": 4,
        "course": "PROG 1400",
        "title": "Intro Obj Oriented Programming",
        "instructor": "Instructor 2",
        "description": "This course is an introduction to the essentials of object oriented programming (OOP). This course provides an explanation of the paradigm on which OOP is based, and how it affects programming strategies and solutions.",
        "room": 114,
        "colour": "#9f9fc2",
        "timeslots": ["wed3", "wed4", "fri3", "fri4"]
    },
    {
        "id": 5,
        "course": "ICOM 2701",
        "title": "Professional Practice for IT I",
        "instructor": "Instructor 3",
        "description": "This course exposes students to tools and processes that support professional continuous improvement. This course builds the foundations for professional habits and methodologies that help graduates remain current and relevant in an ever-evolving profession.",
        "room": 114,
        "colour": "#b46bb4",
        "timeslots": ["thr5", "thr6"]
    }
];


// Populate the table with course information
function loaded() {
    for (let i = 0; i < courses.length; i++) {
        for (let j = 0; j < courses[i].timeslots.length; j++) {

            let y = document.getElementById(courses[i].timeslots[j]);
            y.innerHTML = "<td>" + courses[i].course + "<br />" + courses[i].title + "</td>";
            y.style.backgroundColor = courses[i].colour;
        
            // Changes the colour of a schedule cell on mouse hover
            document.querySelector('table').addEventListener('mouseover', (over) => {
                
                let x = over.target.closest('td');
                if (x) {
                    x.style.background = '#ffffffd5'
                }
            });

            // Removes colour of a schedule cell when not hovered over
            document.querySelector('table').addEventListener('mouseout', (off) => {
                let x = off.target.closest('td');
                if (x) {
                    if (x.textContent.length > 5) {
                        y.style.backgroundColor = courses[i].colour
                    } else {
                        x.style.background = ''
                    }
                }
            });

            // Creates alert on cell click
            y.onclick = function(){
                alert("   \t Room " + courses[i].room + "\n   \t " + courses[i].instructor + "\n   \t " + courses[i].description);
            }
        }
    }
}

// Sets the initial quote for the schedule
document.getElementById("quote").innerHTML = "\"I have no idea what's going on.\" &#0151 Author Unknown 2023";

// Function to hide/show weekend-class elements
function weekends() { 
    var z = document.getElementsByClassName("weekend");
    for (let s = 0; s < document.getElementsByClassName("weekend").length; s++) {
        if (z[s].style.display === "none") {
            z[s].style.display = "table-cell";
        } else {
            z[s].style.display = "none";
        }
    }
}  

// Only one window.onkeydown can exist, as any others will overwrite the last
window.onkeydown = function(e){  
    
    // If s is pressed, call weekends()
    if(e.keyCode === 83){ 
        weekends(); 
        };  

    // If b is pressed, funni happens
    if(e.keyCode === 66){  
        let b = document.getElementById("bee");
        b.style.display = "inline";
        document.getElementsByTagName("body")[0].style.background = "none";
        b.classList.add("beesKnees");

        b.addEventListener("animationend", jazz);
        function jazz() {
            if (confirm("Ya like jazz?") == true) {
            } else {
                alert("I'm disappointed in you.");
            }
        }
    }
}
