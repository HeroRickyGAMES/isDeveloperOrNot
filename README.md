# Is Debug or not

Um plugin em flutter que verifica se o dispositivo está em modo desenvolvimento ou no modo padrão.

Android:

```
  print(await IsDebug.getNativeIsDebugOrNot());
```

Você pode colocar ele em uma variavel boolean no flutter, só que precisará adicionar o await para evitar erros.

Qualquer erro comente na guia de issues no github