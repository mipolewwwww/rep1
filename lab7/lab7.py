import psycopg2
from sqlalchemy import Column, Integer, String, Float, ForeignKey, create_engine
from sqlalchemy.orm import relationship, sessionmaker, declarative_base

Base = declarative_base()


class Category(Base):
    __tablename__ = 'categories'  # Убедитесь, что имя таблицы правильное
    id = Column(Integer, primary_key=True)
    name = Column(String, nullable=False)

class Product(Base):
    __tablename__ = 'products'
    id = Column(Integer, primary_key=True)
    name = Column(String, nullable=False)
    price = Column(Integer, nullable=False)
    category_id = Column(Integer, ForeignKey('categories.id'))



engine = create_engine("postgresql+psycopg2://postgres:123789@localhost:5432/Pr")
Base.metadata.create_all(engine)


Session = sessionmaker(bind=engine)
session = Session()

def sh_all_products():
    products = session.query(Product).all()
    print("Продукты:")
    for product in products:
        print(f"ID: {product.id}, Name: {product.name}, Price: {product.price}, Category ID: {product.category_id}")

def sh_all_categories():
    categories = session.query(Category).all()
    print("Категории:")
    for category in categories:
        print(f"ID: {category.id}, Name: {category.name}")

def create_category(name):
    category = Category(name=name)
    session.add(category)
    session.commit()
    print(f"Категория '{name}' создана.")

def create_product(name, price, category_id):
    product = Product(name=name, price=price, category_id=category_id)
    session.add(product)
    session.commit()
    print(f"Продукт '{name}' создан.")

def get_products_by_category(category_name):
    category = session.query(Category).filter_by(name=category_name).first()
    if category:
        products = session.query(Product).filter_by(category_id=category.id).all()
        print(f"Продукты в категории '{category_name}':")
        for product in products:
            print(f"{product.name}, цена: {product.price}")
    else:
        print(f"Категория '{category_name}' не найдена.")

def upd_product_category(product_id, new_category_id):
    product = session.query(Product).filter_by(id=product_id).first()
    if product:
        product.category_id = new_category_id
        session.commit()
        print(f"Категория проду '{product.name}' обновлена.")
    else:
        print(f"Продукт ID {product_id} не найден.")

def del_category(category_id):
    category = session.query(Category).filter_by(id=category_id).first()
    if category:
        session.delete(category)
        session.commit()
        print(f"Категория '{category.name}' и все связанные продукты удалены.")
    else:
        print(f"Категория с ID {category_id} не найдена.")

if __name__ == "__main__":
    sh_all_products()
    
    '''create_category("Электроника2")

    create_product("Tv2",780,3)

    get_products_by_category("Электроника")'''
