# GUGU Studio Monorepo

本仓库已进入开发阶段，包含三个子系统：

- `miniapp/`：微信小程序（用户端）
- `admin-web/`：PC 管理后台（商家端）
- `backend/`：Java Spring Boot 后端

## 快速开始

### 1) 启动后端（Java 17）

```bash
cd backend
./mvnw spring-boot:run
```

默认地址：`http://localhost:8080`

### 2) 启动管理后台

```bash
cd admin-web
npm install
npm run dev
```

默认地址：`http://localhost:5173`

### 3) 小程序开发

使用微信开发者工具导入 `miniapp/` 目录。

## 当前已完成

- 基础目录结构与工程初始化
- 后端健康检查接口 `/api/health`
- 后端示例业务接口 `/api/mini/home`
- 管理后台基础页面框架（首页/作品/品牌/我的）
- 小程序基础页面框架（启动页/首页/作品/品牌/我的）

## 下一步

- 接入 MySQL + Redis
- 接入图片上传（OSS/MinIO）
- 完成后台内容管理 CRUD
- 完成小程序真实数据联调
