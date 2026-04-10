package com.example.pizzarecipes.service;

import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.dao.IDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProduitService implements IDao<Produit> {

    private static ProduitService INSTANCE;
    private final List<Produit> data = new ArrayList<>();

    private ProduitService() {
        seed();
    }

    public static ProduitService getInstance() {
        if (INSTANCE == null) INSTANCE = new ProduitService();
        return INSTANCE;
    }

    private void seed() {
        data.add(new Produit("BARBECUED CHICKEN PIZZA", 3.0,
                com.example.pizzarecipes.R.mipmap.pizza1, "35 min",
                "- 2 boneless skinless chicken breast halves (6 ounces each)\n- 1/4 teaspoon pepper\n- 1 cup barbecue sauce, divided\n- 1 tube (13.8 ounces) refrigerated pizza crust\n- 2 teaspoons olive oil\n- 2 cups shredded Gouda cheese\n- 1 small red onion, halved and thinly sliced\n- 1/4 cup minced fresh cilantro",
                "So fast and so easy with refrigerated pizza crust, these saucy, smoky pizzas make quick fans with their hot-off-the-grill, rustic flavor. —Alicia Trevithick, Temecula, California",
                "STEP 1:\nSprinkle chicken with pepper; grill until thermometer reads 165°, 5-7 min per side, basting with 1/2 cup barbecue sauce. Cool and cut into cubes.\n\nSTEP 2:\nDivide dough in half. Press each portion onto foil into a 10x8-in. rectangle; brush with oil. Invert onto grill rack. Grill until bottom is lightly browned, 1-2 minutes.\n\nSTEP 3:\nSpread grilled sides with remaining barbecue sauce. Top with cheese, chicken and onion. Grill until cheese is melted, 2-3 minutes. Sprinkle with cilantro."));

        data.add(new Produit("BRUSCHETTA PIZZA", 5.0,
                com.example.pizzarecipes.R.mipmap.pizza2, "35 min",
                "- 1/2 pound reduced-fat bulk pork sausage\n- 1 prebaked 12-inch pizza crust\n- 1 package (6 ounces) sliced turkey pepperoni\n- 2 cups shredded part-skim mozzarella cheese\n- 1-1/2 cups chopped plum tomatoes\n- 1/2 cup fresh basil leaves, thinly sliced\n- 1 tablespoon olive oil\n- 2 garlic cloves, minced\n- 1/2 teaspoon minced fresh thyme\n- 1/2 teaspoon balsamic vinegar\n- 1/4 teaspoon salt\n- 1/8 teaspoon pepper",
                "Loaded with Italian flavor and plenty of fresh tomatoes, it's bound to become a family favorite. —Debra Kell, Owasso, Oklahoma",
                "STEP 1:\nCook sausage until no longer pink; drain. Place crust on baking sheet. Top with pepperoni, sausage and cheese. Bake at 450° for 10-12 minutes.\n\nSTEP 2:\nCombine tomatoes, basil, oil, garlic, thyme, vinegar, salt and pepper. Spoon over pizza."));

        data.add(new Produit("SPINACH PIZZA", 2.0,
                com.example.pizzarecipes.R.mipmap.pizza3, "25 min",
                "- 1 package (6-1/2 ounces) pizza crust mix\n- 1/2 cup Alfredo sauce\n- 2 medium tomatoes\n- 4 cups chopped fresh spinach\n- 2 cups shredded Italian cheese blend",
                "This tasty pizza is so easy to prepare. My family loves it! —Dawn Bartholomew, Raleigh, North Carolina",
                "STEP 1:\nPrepare pizza dough; press onto a greased 12-in. pizza pan.\n\nSTEP 2:\nSpread Alfredo sauce over dough. Top with spinach, tomatoes and cheese.\n\nSTEP 3:\nBake at 450° for 10-15 minutes or until cheese is melted and crust is golden brown."));

        data.add(new Produit("DEEP-DISH SAUSAGE PIZZA", 8.0,
                com.example.pizzarecipes.R.mipmap.pizza4, "45 min",
                "- 1 package (1/4 ounce) active dry yeast\n- 2/3 cup warm water (110° to 115°)\n- 1-3/4 to 2 cups all-purpose flour\n- 1/4 cup vegetable oil\n- 1 teaspoon each dried oregano, basil and marjoram\n- 1/2 teaspoon garlic salt\n- 1/2 teaspoon onion salt",
                "My Grandma made the tastiest snacks for us when we stayed at her farm. Her wonderful pizza had fragrant herbs in the crust. —Michele Madden, Washington Court House, Ohio",
                "STEP 1:\nDissolve yeast in water. Add flour, oil and seasonings; knead until smooth, 6-8 minutes. Let rise until doubled, about 1 hour. Roll into a 15-in. circle; transfer to a greased skillet. Sprinkle with 1 cup mozzarella.\n\nSTEP 2:\nSaute onion, green peppers and seasonings. Layer half over crust. Add Parmesan, sausage and tomatoes. Sprinkle with 2 cups mozzarella. Repeat layers. Fold crust to form an edge. Bake at 400° for 20 minutes. Add pepperoni and remaining mozzarella; bake 10-15 minutes more."));

        data.add(new Produit("HOMEMADE PIZZA", 4.0,
                com.example.pizzarecipes.R.mipmap.pizza5, "50 min",
                "- 1 package (1/4 ounce) active dry yeast\n- 1 teaspoon sugar\n- 1-1/4 cups warm water (110° to 115°)\n- 1/4 cup canola oil\n- 1 teaspoon salt\n- 3-1/2 cups all-purpose flour\n- 1/2 pound ground beef\n- 1 small onion, chopped\n- 1 can (15 ounces) tomato sauce\n- 1 teaspoon dried basil\n- 1 medium green pepper, diced\n- 2 cups shredded part-skim mozzarella cheese",
                "A hearty, zesty main dish with a crisp, golden crust. Use whatever toppings your family enjoys! —Marianne Edwards, Lake Stevens, Washington",
                "STEP 1:\nDissolve yeast and sugar in water; let stand 5 minutes. Add oil, salt and flour to form a soft dough. Knead 2-3 minutes. Let rise until doubled, about 45 minutes.\n\nSTEP 2:\nCook beef and onion until no longer pink; drain.\n\nSTEP 3:\nDivide dough; press into two greased 12-in. pizza pans. Spread tomato sauce with oregano and basil. Top with beef, green pepper and cheese.\n\nSTEP 4:\nBake at 400° for 25-30 minutes or until crust is lightly browned."));

        data.add(new Produit("PESTO CHICKEN PIZZA", 3.0,
                com.example.pizzarecipes.R.mipmap.pizza6, "50 min",
                "- 2 teaspoons active dry yeast\n- 1 cup warm water (110° to 115°)\n- 2-3/4 cups bread flour\n- 1 tablespoon plus 2 teaspoons olive oil, divided\n- 1 tablespoon sugar\n- 1-1/2 teaspoons salt, divided\n- 1/2 pound boneless skinless chicken breasts, cut into 1/2-inch pieces\n- 1 small onion, halved and thinly sliced\n- 1/2 each small green, red and yellow peppers, julienned\n- 1/2 cup sliced fresh mushrooms\n- 3 tablespoons prepared pesto\n- 1-1/2 cups shredded part-skim mozzarella cheese\n- 1/4 teaspoon pepper",
                "Keeping the spices simple helps the flavors of the chicken and vegetables come through. —Heather Thompson, Woodland Hills, California",
                "STEP 1:\nDissolve yeast in water. Beat in 1 cup flour, oil, sugar and salt. Add remaining flour. Knead until smooth, 6-8 minutes. Let rise until doubled, about 1 hour.\n\nSTEP 2:\nCook chicken, onion, peppers and mushrooms in oil until done; set aside.\n\nSTEP 3:\nRoll dough into a 15-in. circle; transfer to a 14-in. pizza pan. Spread with pesto. Top with chicken mixture and cheese. Sprinkle with pepper and salt.\n\nSTEP 4:\nBake at 400° for 18-20 minutes or until crust and cheese are lightly browned."));

        data.add(new Produit("LOADED MEXICAN PIZZA", 3.0,
                com.example.pizzarecipes.R.mipmap.pizza7, "30 min",
                "- 1 can (15 ounces) black beans, rinsed and drained\n- 1 medium red onion, chopped\n- 1 small sweet yellow pepper, chopped\n- 3 teaspoons chili powder\n- 3/4 teaspoon ground cumin\n- 3 medium tomatoes, chopped\n- 1 jalapeno pepper, seeded and finely chopped\n- 1 garlic clove, minced\n- 1 prebaked 12-inch thin pizza crust\n- 2 cups chopped fresh spinach\n- 2 tablespoons minced fresh cilantro\n- Hot pepper sauce to taste\n- 1/2 cup shredded reduced-fat cheddar cheese\n- 1/2 cup shredded pepper jack cheese",
                "My husband is a picky eater, but this healthy pizza has lots of flavor and tastes even better the next day. —Mary Barker, Knoxville, Tennessee",
                "STEP 1:\nMash black beans; stir in onion, yellow pepper, chili powder and cumin. Combine tomatoes, jalapeno and garlic in another bowl.\n\nSTEP 2:\nPlace crust on pizza pan; spread with bean mixture. Top with tomato mixture and spinach. Sprinkle with cilantro, pepper sauce and cheeses.\n\nSTEP 3:\nBake at 400° for 12-15 minutes or until cheese is melted."));

        data.add(new Produit("BACON CHEESEBURGER PIZZA", 2.0,
                com.example.pizzarecipes.R.mipmap.pizza8, "20 min",
                "- 1/2 pound ground beef\n- 1 small onion, chopped\n- 1 prebaked Italian bread shell crust (1 pound)\n- 1 can (8 ounces) pizza sauce\n- 6 bacon strips, cooked and crumbled\n- 20 dill pickle coin slices\n- 2 cups shredded mozzarella cheese\n- 2 cups shredded cheddar cheese\n- 1 teaspoon pizza or Italian seasoning",
                "Kids of all ages love pizza and cheeseburgers, and this recipe combines them both! —Cherie Ackerman, Lakeland, Minnesota",
                "STEP 1:\nCook beef and onion until no longer pink; drain.\n\nSTEP 2:\nPlace crust on pizza pan. Spread with pizza sauce. Top with beef mixture, bacon, pickles and cheeses. Sprinkle with pizza seasoning. Bake at 450° for 8-10 minutes or until cheese is melted."));

        data.add(new Produit("PIZZA MARGHERITA", 1.0,
                com.example.pizzarecipes.R.mipmap.pizza9, "30 min",
                "- 3 teaspoons active dry yeast\n- 1 cup warm water (110° to 115°)\n- 2 tablespoons olive oil\n- 1 teaspoon sugar\n- 1 teaspoon salt\n- 3 cups bread flour",
                "Named for Queen Margherita of Italy, this classic pizza shows off the Italian flag's colors. —Loretta Lawrence, Myrtle Beach, South Carolina",
                "STEP 1:\nDissolve yeast in warm water. Add oil, sugar, salt and 1 cup flour; beat until smooth. Stir in remaining flour to form a soft dough.\n\nSTEP 2:\nKnead until smooth and elastic, 6-8 minutes. Let rise until doubled, about 1 hour.\n\nSTEP 3:\nDivide dough in half; roll each into a 13-in. circle. Transfer to two 14-in. pizza pans. Let rest 10 minutes.\n\nSTEP 4:\nTop with tomatoes, basil, cheese, oregano, pepper flakes, salt and pepper. Drizzle with oil. Bake at 450° for 15-20 minutes."));

        data.add(new Produit("PEPPERONI-SAUSAGE STUFFED PIZZA", 5.0,
                com.example.pizzarecipes.R.mipmap.pizza10, "45 min",
                "- 1 package (1/4 ounce) active dry yeast\n- 1-1/4 cups warm water (110° to 115°)\n- 2 tablespoons olive oil\n- 1-1/2 teaspoons salt\n- 1 teaspoon sugar\n- 3-1/2 to 4 cups all-purpose flour",
                "For 30 years, friends have been telling me to open a pizzeria using this recipe. It even freezes well. —Elizabeth Wolff, Carmel, Indiana",
                "STEP 1:\nDissolve yeast in warm water. Combine oil, salt, sugar, yeast mixture and 1 cup flour; beat until smooth. Add remaining flour to form a stiff dough. Knead 6-8 minutes. Let rise until doubled, about 1 hour.\n\nSTEP 2:\nPreheat oven to 425°. Combine two portions of dough; roll into a 15x11-in. rectangle. Press into greased 13x9-in. pan. Top with mozzarella, cheddar, seasonings, sausage, mushrooms and pepperoni.\n\nSTEP 3:\nRoll remaining dough into a 13x9-in. rectangle; place over filling, crimping edges. Prick top with fork. Sprinkle with remaining cheeses. Bake 10 minutes.\n\nSTEP 4:\nReduce heat to 375°. Spread pizza sauce over cheese. Bake 30-35 minutes. Let stand 10 minutes before cutting."));
    }

    @Override
    public Produit create(Produit p) {
        data.add(p);
        return p;
    }

    @Override
    public Produit update(Produit p) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == p.getId()) {
                data.set(i, p);
                return p;
            }
        }
        return null;
    }

    @Override
    public boolean delete(long id) {
        return data.removeIf(x -> x.getId() == id);
    }

    @Override
    public Produit findById(long id) {
        for (Produit p : data) if (p.getId() == id) return p;
        return null;
    }

    @Override
    public List<Produit> findAll() {
        return Collections.unmodifiableList(data);
    }
}