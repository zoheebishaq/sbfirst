<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>todo liste</title>
</head>
<body>
<ul>
    <#list todos as todo>
    <li>

        todo: ${tododisplay}
    </li>
    </#list>
</ul>
</body>
</html>