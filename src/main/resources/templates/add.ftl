<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
    <meta charset="UTF-8">
    <title>增加食譜</title>
</head>

<body>
<div class="container">
    <form id="addRecipe" name="addRecipe" action="/cookbook/addRecipe" method="post">
        <div class="login-wrap">

            <div class="input-group">
                <span class="input-group-addon"><i class="icon_profile"></i></span>
                <input type="text" name="name" id="name" class="form-control" placeholder="菜名"
                       autofocus="autofocus" data-rule-required="true" data-msg-required="請輸入菜名"/>
            </div>

            <div class="input-group">
                <span class="input-group-addon"><i class="icon_profile"></i></span>
                <select name="type" id="type" class="form-control">
                    <option value="" selected>---select---</option>
                    <option value="中餐">中餐</option>
                    <option value="西餐">西餐</option>
                    <option value="甜點">甜點</option>
                </select>
            </div>

            <div class="input-group">
                <span class="input-group-addon"><i class="icon_profile"></i></span>
                <input type="text" name="material" id="material" class="form-control" placeholder="原料"
                       autofocus="autofocus" data-rule-required="true" data-msg-required="請輸入原料"/>
            </div>

            <div class="input-group">
                <span class="input-group-addon"><i class="icon_profile"></i></span>
                <input type="text" name="recipe" id="recipe" class="form-control" placeholder="食譜做法"
                       autofocus="autofocus" data-rule-required="true" data-msg-required="請輸入食譜做法"/>
            </div>

<#--            <div class="input-group">-->
<#--                <span class="input-group-addon"><i class="icon_key_alt"></i></span>-->
<#--                <input type="password" name="password" id="password" class="form-control" placeholder="請輸入密碼"-->
<#--                       data-rule-required="true" />-->
<#--            </div>-->

<#--            <div class="input-group">-->
<#--                <span class="input-group-addon"><i class="icon_key_alt"></i></span>-->
<#--                <input type="password" name="password2" id="password2" class="form-control" placeholder="請再次輸入密碼"-->
<#--                       data-rule-required="true" />-->
<#--            </div>-->

            <!--<div id="hint"></div>-->
            <#--            <button class="btn btn-primary btn-lg btn-block" type="button"  onclick="/addMember">註冊</button>-->
            <form action="/cookbook/addRecipe" method="post">
                <input class="btn btn-primary btn-lg btn-block" type="submit" value="增加" >
            </form>
        </div>
    </form>
</div>
</body>
</html>