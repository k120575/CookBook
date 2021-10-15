<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Search</title>
</head>

<body>
<table border="2" width="800" align="center">
    <tr align="center">
        <th>菜名</th>
        <th>類型</th>
        <th>食材</th>
        <th>作法</th>
    </tr>
    <#list cookbookList as list>
        <#if list??>
            <tr align="center">
                <td>${list.name}</td>
                <td>${list.type}</td>
                <td>${list.material}</td>
                <td>${list.recipe}</td>
            </tr>
        </#if>
    <#else>
        <h2>${errMsg}</h2>
    </#list>

</table>


</body>
</html>