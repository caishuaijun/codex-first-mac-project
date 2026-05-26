import { createRouter, createWebHistory } from 'vue-router'

const routes = [
  { path: '/', component: () => import('../views/HomeView.vue') },
  { path: '/works', component: () => import('../views/WorksView.vue') },
  { path: '/brand', component: () => import('../views/BrandView.vue') },
  { path: '/profile', component: () => import('../views/ProfileView.vue') }
]

export default createRouter({
  history: createWebHistory(),
  routes
})
