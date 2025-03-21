class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        List<String> ans = new ArrayList<>();
        Set<String> supp = new HashSet<>(Arrays.asList(supplies));
        int n = recipes.length;
        boolean addedNewRecipe;

        do {
            addedNewRecipe = false;
            for (int i = 0; i < n; i++) {
                if (!ans.contains(recipes[i])) {
                    boolean canPrepare = true;
                    for (String ingredient : ingredients.get(i)) {
                        if (!supp.contains(ingredient)) {
                            canPrepare = false;
                            break;
                        }
                    }
                    if (canPrepare) {
                        ans.add(recipes[i]);
                        supp.add(recipes[i]); 
                        addedNewRecipe = true;
                    }
                }
            }
        } while (addedNewRecipe); 

        return ans;
    }
}