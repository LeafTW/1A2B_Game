## Game 1A2B 控制器

這個控制器負責管理 1A2B 遊戲相關的操作，包括了以下功能：

### 開始遊戲

- **URL:** `GET /game/start`
- **描述:** 開始一場新的 1A2B 遊戲，生成一組隨機的答案並保存到數據庫中。
- **回應:** 返回成功開始遊戲的訊息，以及遊戲的唯一識別 ID。

### 猜數字

- **URL:** `POST /game/guess`
- **描述:** 玩家猜測答案。
- **參數:**
  - `guessId`: 遊戲的識別 ID。
  - `guessStr`: 玩家猜測的數字字符串。
- **回應:** 返回玩家猜測結果，例如 "2A1B"。
  
### 猜測紀錄

- **URL:** `GET /game/guessLog`
- **描述:** 獲取指定遊戲的猜測紀錄。
- **參數:**
  - `guessId`: 遊戲的識別 ID。
- **回應:** 返回指定遊戲的猜測紀錄列表。

## 使用的技術

- 此控制器使用了 Spring 框架。
- 使用了 Spring Data JPA 與數據庫進行數據存儲和查詢。

## 注意事項

- 需要遊戲的識別 ID 來進行猜測和獲取猜測紀錄，請確保提供正確的識別 ID。
- 開始遊戲後會返回一個唯一的遊戲識別 ID，猜測時需要使用這個識別 ID。
- 請確保適當處理猜測結果，並保存猜測紀錄。

以上是對於 Game 1A2B 控制器的簡要說明和使用指南。如有任何疑問，請隨時聯繫相關開發人員。