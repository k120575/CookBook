<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
    <meta charset="UTF-8">
    <title>COOKBOOK</title>
</head>
<body>
    <div class="container">
        <form class="form-vertical login-form" action="/cookbook/searchRecipe" method="post">
            <h3 class="form-title">
                請輸入要搜尋的內容
            </h3>
            <div class="form-group">
                <div class="input-icon">
                    <input type="text" name="name" id="name" class="form-control" placeholder="菜名"
                           autofocus="autofocus" data-rule-required="true" data-msg-required="請輸入帳號。"
                    />
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
            </div>
            <br>
            <form class="form-vertical login-form" action="/cookbook/searchRecipe" method="post" style="float: right">
                <button type="submit" class="submit btn btn-primary pull-right">
                    搜尋
                </button>
            </form>
            <br>
            <form class="form-vertical login-form" action="/cookbook/add" method="post" style="float: left">
                <button type="submit" class="submit btn btn-primary pull-right">
                    增加
                </button>
            </form>
        </form>
    </div>
</body>
</html>