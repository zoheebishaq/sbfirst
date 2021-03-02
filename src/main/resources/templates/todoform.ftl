<!DOCTYPE html>
<html>
<head>
    <title>Servlet Lifecycle</title>
</head>
<body>
<h1>Ajouter une tache</h1>
<form method="post" action="/todo" name="task">
    <input type="text" name="task"><br/>
    <input type="radio" name="scope" value="session" checked> Session
    <input type="radio" name="scope" value="application"> Application<br/>
    <input type="submit">

</form>
<h1>Todos</h1>
<h2>Global</h2>
<ul>
    <#list todos as todo>
        <li>${todo}</li>
    </#list>
</ul>
<h2>Session</h2>
<ul>
    <#list todoSession as todo>
        <li>${todo}</li>
    </#list>
</ul>

</body>
</html>