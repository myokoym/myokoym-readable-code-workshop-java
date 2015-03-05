# 実践リーダブルコード

レシピ管理プログラム

## 開発言語

Java

## 使い方

引数にレシピファイルを指定してRecipe.javaのmainメソッドを実行してください。

### レシピファイルの書き方

一行目にレシピ名を書いてください。

例:

```
冷やし中華
```

### EclipseなどのIDE

RecipeクラスをJavaアプリケーションとして実行してください。

その際、実行の構成で引数にdata/recipe-data.txtを指定してください。

### コマンドライン

Recipe.javaをjavacコマンドでコンパイルしてからjavaコマンドで実行してください。

```bash
$ javac -d bin/ src/net/myokoym/recipe/*.java
$ java -cp bin/ net.myokoym.recipe.Recipe data/recipe-data.txt
```

## EGitメモ

### Gitリポジトリー作成手順

1. Javaプロジェクト作成
  * メニューバー -> File -> New ->Java Project
2. プロジェクトを右クリック -> Team -> Share Projectを選択
3. Gitを選択
4. 「Use or create repository in parent folder of project」にチェック
5. Create Repositoryを押してFinish

### remoteの登録手順

1. メニューバー -> Window -> Show View -> Other -> Git -> Git Repositoriesを選択
2. Git RepositoriesビューのRecipe/Remotesを右クリック
3. Create Remote
4. remote名（originなど）を入力
5. GitHubで作成したリポジトリーのURLを入力

### commit手順

1. プロジェクトまたはファイルを右クリック -> Team -> Commitを選択
2. コミットするファイルを選択（プロジェクトを右クリックした場合）
3. コミットメッセージを入力
4. CommitまたはCommit and Pushを押す

### コミットログ確認手順

1. Git RepositoriesビューのRecipeを右クリック
2. Show In -> Historyを選択
3. （右クリックからpushもできます）

### clone手順

1. メニューバー -> File -> Importを選択
2. Git -> Projects from Gitを選択
3. Clone URIを選択
4. フォークしたGitHubリポジトリーのURLを入力
5. ブランチ（master）を選択
6. あとはデフォルトのまま数回Nextを押してFinish
7. Git Repositoriesビューにクローンしたリポジトリーが表示されればOK

### SSHキーの場所の設定

1. メニューバー -> Window -> Preferenceを選択
2. sshで検索して、SSH2の項目を選択
