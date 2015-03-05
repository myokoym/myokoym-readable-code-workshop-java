# 実践リーダブルコード

レシピ管理プログラム

## 開発言語

Java

## 使い方

Recipe.javaのmainメソッドを実行してください。

### EclipseなどのIDE

RecipeクラスをJavaアプリケーションとして実行してください。

### コマンドライン

Recipe.javaをjavacコマンドでコンパイルしてからjavaコマンドで実行してください。

```bash
$ javac -d bin/ src/net/myokoym/recipe/*.java
$ java -cp bin/ net.myokoym.recipe.Recipe
```

## EGitメモ

### Gitリポジトリー作成手順

1. Javaプロジェクト作成
2. Team -> Share Projectを選択
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

### clone手順

TODO