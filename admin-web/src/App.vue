<template>
  <div class="layout">
    <aside class="sidebar">
      <h1>GUGU 后台</h1>
      <nav>
        <RouterLink to="/">首页</RouterLink>
        <RouterLink to="/works">作品</RouterLink>
        <RouterLink to="/brand">品牌</RouterLink>
        <RouterLink to="/profile">我的</RouterLink>
      </nav>
    </aside>
    <main class="main"><RouterView /></main>
  </div>
</template>

<style>
body { margin: 0; font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", sans-serif; }
.layout { display: grid; grid-template-columns: 220px 1fr; min-height: 100vh; }
.sidebar { padding: 20px; border-right: 1px solid #eee; }
.sidebar nav { display: flex; flex-direction: column; gap: 12px; }
.main { padding: 24px; }
</style>
