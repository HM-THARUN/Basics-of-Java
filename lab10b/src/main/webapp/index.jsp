<!DOCTYPE html>
<html>
<head>
    <title>Student Result Form</title>

    <script>
        function validateForm() {
            let roll = document.forms["form"]["rollno"].value;
            let name = document.forms["form"]["name"].value;
            let sub1 = document.forms["form"]["sub1"].value;
            let sub2 = document.forms["form"]["sub2"].value;
            let sub3 = document.forms["form"]["sub3"].value;
            let sub4 = document.forms["form"]["sub4"].value;
            let sub5 = document.forms["form"]["sub5"].value;

            if (roll == "" || name == "" || sub1 == "" || sub2 == "" ||
                sub3 == "" || sub4 == "" || sub5 == "") {
                alert("All fields are required!");
                return false;
            }

            let marks = [sub1, sub2, sub3, sub4, sub5];

            for (let i = 0; i < marks.length; i++) {
                if (marks[i] < 0 || marks[i] > 100) {
                    alert("Marks must be between 0 and 100");
                    return false;
                }
            }

            return true;
        }
    </script>
</head>

<body>

<h2>Student Result Form</h2>

<form name="form" action="ResultServlet" method="post" onsubmit="return validateForm()">

    Roll No: <input type="text" name="rollno"><br><br>
    Name: <input type="text" name="name"><br><br>

    Sub1: <input type="number" name="sub1"><br><br>
    Sub2: <input type="number" name="sub2"><br><br>
    Sub3: <input type="number" name="sub3"><br><br>
    Sub4: <input type="number" name="sub4"><br><br>
    Sub5: <input type="number" name="sub5"><br><br>

    <input type="submit" value="Calculate Result">

</form>

</body>
</html>