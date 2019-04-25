package arrow.dagger.extensions

import arrow.core.EitherPartialOf
import arrow.core.extensions.EitherApplicative
import arrow.core.extensions.EitherFoldable
import arrow.core.extensions.EitherFunctor
import arrow.core.extensions.EitherMonad
import arrow.core.extensions.EitherSemigroupK
import arrow.core.extensions.EitherTraverse
import arrow.typeclasses.Applicative
import arrow.typeclasses.Foldable
import arrow.typeclasses.Functor
import arrow.typeclasses.Monad
import arrow.typeclasses.SemigroupK
import arrow.typeclasses.Traverse
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
abstract class EitherInstances<L> {

  @Provides
  fun eitherFunctor(ev: DaggerEitherFunctor<L>): Functor<EitherPartialOf<L>> = ev

  @Provides
  fun eitherApplicative(ev: DaggerEitherApplicative<L>): Applicative<EitherPartialOf<L>> = ev

  @Provides
  fun eitherMonad(ev: DaggerEitherMonad<L>): Monad<EitherPartialOf<L>> = ev

  @Provides
  fun eitherFoldable(ev: DaggerEitherFoldable<L>): Foldable<EitherPartialOf<L>> = ev

  @Provides
  fun eitherTraverse(ev: DaggerEitherTraverse<L>): Traverse<EitherPartialOf<L>> = ev

  @Provides
  fun eitherSemigroupK(ev: DaggerEitherSemigroupK<L>): SemigroupK<EitherPartialOf<L>> = ev
}

class DaggerEitherFunctor<F> @Inject constructor() : EitherFunctor<F>
class DaggerEitherApplicative<F> @Inject constructor() : EitherApplicative<F>
class DaggerEitherMonad<F> @Inject constructor() : EitherMonad<F>
class DaggerEitherFoldable<F> @Inject constructor() : EitherFoldable<F>
class DaggerEitherTraverse<F> @Inject constructor() : EitherTraverse<F>
class DaggerEitherSemigroupK<F> @Inject constructor() : EitherSemigroupK<F>
