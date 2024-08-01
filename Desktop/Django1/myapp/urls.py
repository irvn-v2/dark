
from django.contrib import admin
from django.urls import path
from myapp import views

urlpatterns = [
    path('admin/', admin.site.urls),
    path('', views.home,name="home"),
    path('gallery/', views.gallery,name="gallery"),
    path('form/', views.form,name="form"),
    path('table/', views.table,name="table"),
]
