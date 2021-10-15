<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Search</title>
</head>

<body>
<#list cookbookList as list>
    <#if list??>
        <h2>${list.name}  /  ${list.type}  /  ${list.material}</h2>
    </#if>
    <#else>
    <h2>${errMsg}</h2>
</#list>

</body>
</html>