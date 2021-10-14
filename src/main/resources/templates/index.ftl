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
                請輸入您的帳號與密碼
            </h3>
            <div class="form-group">
                <div class="input-icon">
                    <input type="text" name="name" id="name" class="form-control" placeholder="菜名"
                           autofocus="autofocus" data-rule-required="true" data-msg-required="請輸入帳號。"
                    />
                </div>
            </div>
            <form class="form-vertical login-form" action="/cookbook/searchRecipe" method="post">
                <button type="submit" class="submit btn btn-primary pull-right" style="display: inline">
                    搜尋
                </button>
            </form>
            <form class="form-vertical login-form" action="/cookbook/add" method="post">
                <button type="submit" class="submit btn btn-primary pull-right" style="display: inline">
                    增加
                </button>
            </form>
        </form>
    </div>
</body>
</html>