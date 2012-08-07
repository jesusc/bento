
phase 'simple' do
  rule 'classes' do
    from Concept::EClass
    to   OUT::MClass
    mapping do |source, target| 
      target.features = source.eAllStructuralFeatures
    end
  end
  
  copy_rule 'attribute' do
    from Concept::EAttribute
    to   OUT::MAttribute
    mapping do |source, target| 
    end    
  end

  copy_rule 'reference' do
    from Concept::EReference
    to   OUT::MReference
    mapping do |source, target| 
    end    
  end  
end

scheduling do
  execute 'simple'
end